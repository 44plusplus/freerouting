package app.freerouting.designforms.specctra;

import app.freerouting.logger.FRLogger;

/** Class for reading resolution scopes from dsn-files. */
public class Unit extends ScopeKeyword {

  /** Creates a new instance of Unit */
  public Unit() {
    super("unit");
  }

  public static void write_scope(
      app.freerouting.datastructures.IndentFileWriter p_file,
      app.freerouting.board.Unit p_unit)
      throws java.io.IOException {
    p_file.new_line();
    p_file.write("(unit ");
    p_file.write(p_unit.toString());
    p_file.write(")");
  }

  public boolean read_scope(ReadScopeParameter p_par) {
    return false;
  }
}
