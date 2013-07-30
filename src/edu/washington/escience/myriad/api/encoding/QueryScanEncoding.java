package edu.washington.escience.myriad.api.encoding;

import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableList;

import edu.washington.escience.myriad.Schema;
import edu.washington.escience.myriad.operator.Operator;
import edu.washington.escience.myriad.operator.DbQueryScan;
import edu.washington.escience.myriad.parallel.Server;

public class QueryScanEncoding extends OperatorEncoding<DbQueryScan> {
  public Schema schema;
  public String sql;
  private static final List<String> requiredArguments = ImmutableList.of("schema", "sql");

  @Override
  public DbQueryScan construct(final Server server) {
    return new DbQueryScan(sql, schema);
  }

  @Override
  public void connect(Operator current, Map<String, Operator> operators) {
    /* Do nothing; no children. */
  }

  @Override
  protected List<String> getRequiredArguments() {
    return requiredArguments;
  }
}