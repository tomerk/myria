#!/usr/bin/env python

import unittest
from tempfile import NamedTemporaryFile
from myria import MyriaConnection, MyriaRelation, MyriaQuery, MyriaError


class MyriaTestBase(unittest.TestCase):
    def setUp(self):
        connection = MyriaConnection(hostname='localhost', port=8753, execution_url="http://127.0.0.1:8080")
        MyriaRelation.DefaultConnection = connection
        self.connection = connection

class DoWhileTest(MyriaTestBase):
    def test(self):
        program = """
x = [0 as exp, 1 as val];
do
  x = [from x emit exp+1 as exp, 2*val as val];
while [from x emit max(exp) < 5];
store(x, powersOfTwo);
"""
        query = MyriaQuery.submit(program)
        expected = [{'val': 32, 'exp': 5}]

        self.assertEqual(query.status, 'SUCCESS')
        self.assertEqual(query.to_dict(), expected)


class IngestEmptyQueryTest(MyriaTestBase):
    def test(self):
        # Create empty file
        with NamedTemporaryFile() as f:
            #TODO change URL to local file
            program = """
emptyrelation = load('https://s3-us-west-2.amazonaws.com/bhaynestemp/emptyrelation', csv(schema(foo:string, bar:int)));
store(emptyrelation, emptyrelation);
"""
        expected = []
        query = MyriaQuery.submit(program)
        self.assertEqual(query.status, 'SUCCESS')
        self.assertEqual(query.to_dict(), expected)


if __name__ == '__main__':
    unittest.main()
