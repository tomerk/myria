package edu.washington.escience.myria.file;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

import edu.washington.escience.myria.Schema;
import edu.washington.escience.myria.Type;
import edu.washington.escience.myria.operator.FileScan;
import edu.washington.escience.myria.operator.SinkRoot;
import edu.washington.escience.myria.tipsy.TipsyFileScanSpeedTest;

public class FileScanSpeedTest extends AbstractBenchmark {
  /** The logger for this class. */
  private static final Logger LOGGER = LoggerFactory.getLogger(TipsyFileScanSpeedTest.class);

  @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
  @Test
  public void fileScanTest() throws Exception {
    Type[] typeAr = { Type.INT_TYPE, // followee
        Type.INT_TYPE, // follower
    };
    Schema schema = new Schema(Arrays.asList(typeAr));
    final int limit = 10 * 1000 * 1000;

    // generated using hadoop fs -cat hdfs://vega.cs.washington.edu:8020//datasets/twitter/twitter_rv.net | head
    // -70000000 > twitter_rv.1GB.net
    // FileScan scan = new FileScan("data_nocommit/speedtest/twitter/twitter_rv.1GB.net", schema, "\t");

    FileScan scan = new FileScan("hdfs://vega.cs.washington.edu:8020//datasets/twitter/twitter_rv.net", schema, "\t");
    SinkRoot sink = new SinkRoot(scan, limit);
    sink.open(null);
    while (!sink.eos()) {
      sink.nextReady();
    }
    sink.close();
    LOGGER.info("Read {} tuples from the file.", sink.getCount());
    assertEquals(limit, sink.getCount());
  }
}