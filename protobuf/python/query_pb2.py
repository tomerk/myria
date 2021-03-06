# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: query.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='query.proto',
  package='',
  serialized_pb=_b('\n\x0bquery.proto\"\xcb\x02\n\x0cQueryMessage\x12\x10\n\x08query_id\x18\x01 \x02(\x04\x12\x13\n\x0bsubquery_id\x18\x02 \x02(\x04\x12 \n\x04type\x18\x03 \x02(\x0e\x32\x12.QueryMessage.Type\x12\"\n\x0cquery_report\x18\x04 \x01(\x0b\x32\x0c.QueryReport\x12\x15\n\x05query\x18\x05 \x01(\x0b\x32\x06.Query\x12\x11\n\tworker_id\x18\x06 \x01(\x05\"\xa3\x01\n\x04Type\x12\x14\n\x10QUERY_DISTRIBUTE\x10\x00\x12\x0f\n\x0bQUERY_START\x10\x01\x12\x0f\n\x0bQUERY_PAUSE\x10\x07\x12\x10\n\x0cQUERY_RESUME\x10\x08\x12\x0e\n\nQUERY_KILL\x10\t\x12\x1a\n\x16QUERY_READY_TO_EXECUTE\x10\x02\x12\x12\n\x0eQUERY_COMPLETE\x10\x06\x12\x11\n\rQUERY_RECOVER\x10\x03\"\x16\n\x05Query\x12\r\n\x05query\x18\x01 \x02(\x0c\"a\n\x0bQueryReport\x12\x0f\n\x07success\x18\x01 \x02(\x08\x12\x32\n\x14\x65xecution_statistics\x18\x02 \x02(\x0b\x32\x14.ExecutionStatistics\x12\r\n\x05\x63\x61use\x18\x03 \x01(\x0c\"%\n\x13\x45xecutionStatistics\x12\x0e\n\x06\x65lapse\x18\x02 \x02(\x04\x42\x31\n#edu.washington.escience.myria.protoB\nQueryProto')
)
_sym_db.RegisterFileDescriptor(DESCRIPTOR)



_QUERYMESSAGE_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='QueryMessage.Type',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='QUERY_DISTRIBUTE', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='QUERY_START', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='QUERY_PAUSE', index=2, number=7,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='QUERY_RESUME', index=3, number=8,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='QUERY_KILL', index=4, number=9,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='QUERY_READY_TO_EXECUTE', index=5, number=2,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='QUERY_COMPLETE', index=6, number=6,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='QUERY_RECOVER', index=7, number=3,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=184,
  serialized_end=347,
)
_sym_db.RegisterEnumDescriptor(_QUERYMESSAGE_TYPE)


_QUERYMESSAGE = _descriptor.Descriptor(
  name='QueryMessage',
  full_name='QueryMessage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='query_id', full_name='QueryMessage.query_id', index=0,
      number=1, type=4, cpp_type=4, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='subquery_id', full_name='QueryMessage.subquery_id', index=1,
      number=2, type=4, cpp_type=4, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='type', full_name='QueryMessage.type', index=2,
      number=3, type=14, cpp_type=8, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='query_report', full_name='QueryMessage.query_report', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='query', full_name='QueryMessage.query', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='worker_id', full_name='QueryMessage.worker_id', index=5,
      number=6, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _QUERYMESSAGE_TYPE,
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=16,
  serialized_end=347,
)


_QUERY = _descriptor.Descriptor(
  name='Query',
  full_name='Query',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='query', full_name='Query.query', index=0,
      number=1, type=12, cpp_type=9, label=2,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=349,
  serialized_end=371,
)


_QUERYREPORT = _descriptor.Descriptor(
  name='QueryReport',
  full_name='QueryReport',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='success', full_name='QueryReport.success', index=0,
      number=1, type=8, cpp_type=7, label=2,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='execution_statistics', full_name='QueryReport.execution_statistics', index=1,
      number=2, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='cause', full_name='QueryReport.cause', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=373,
  serialized_end=470,
)


_EXECUTIONSTATISTICS = _descriptor.Descriptor(
  name='ExecutionStatistics',
  full_name='ExecutionStatistics',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='elapse', full_name='ExecutionStatistics.elapse', index=0,
      number=2, type=4, cpp_type=4, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=472,
  serialized_end=509,
)

_QUERYMESSAGE.fields_by_name['type'].enum_type = _QUERYMESSAGE_TYPE
_QUERYMESSAGE.fields_by_name['query_report'].message_type = _QUERYREPORT
_QUERYMESSAGE.fields_by_name['query'].message_type = _QUERY
_QUERYMESSAGE_TYPE.containing_type = _QUERYMESSAGE
_QUERYREPORT.fields_by_name['execution_statistics'].message_type = _EXECUTIONSTATISTICS
DESCRIPTOR.message_types_by_name['QueryMessage'] = _QUERYMESSAGE
DESCRIPTOR.message_types_by_name['Query'] = _QUERY
DESCRIPTOR.message_types_by_name['QueryReport'] = _QUERYREPORT
DESCRIPTOR.message_types_by_name['ExecutionStatistics'] = _EXECUTIONSTATISTICS

QueryMessage = _reflection.GeneratedProtocolMessageType('QueryMessage', (_message.Message,), dict(
  DESCRIPTOR = _QUERYMESSAGE,
  __module__ = 'query_pb2'
  # @@protoc_insertion_point(class_scope:QueryMessage)
  ))
_sym_db.RegisterMessage(QueryMessage)

Query = _reflection.GeneratedProtocolMessageType('Query', (_message.Message,), dict(
  DESCRIPTOR = _QUERY,
  __module__ = 'query_pb2'
  # @@protoc_insertion_point(class_scope:Query)
  ))
_sym_db.RegisterMessage(Query)

QueryReport = _reflection.GeneratedProtocolMessageType('QueryReport', (_message.Message,), dict(
  DESCRIPTOR = _QUERYREPORT,
  __module__ = 'query_pb2'
  # @@protoc_insertion_point(class_scope:QueryReport)
  ))
_sym_db.RegisterMessage(QueryReport)

ExecutionStatistics = _reflection.GeneratedProtocolMessageType('ExecutionStatistics', (_message.Message,), dict(
  DESCRIPTOR = _EXECUTIONSTATISTICS,
  __module__ = 'query_pb2'
  # @@protoc_insertion_point(class_scope:ExecutionStatistics)
  ))
_sym_db.RegisterMessage(ExecutionStatistics)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n#edu.washington.escience.myria.protoB\nQueryProto'))
# @@protoc_insertion_point(module_scope)
