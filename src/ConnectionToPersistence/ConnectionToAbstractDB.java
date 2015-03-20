package ConnectionToPersistence;

import java.sql.ResultSet;

public abstract class ConnectionToAbstractDB {
	public abstract void open();
	public abstract void close();
	public abstract ResultSet requestSelectQuery();
	public abstract int requestInsertQuery();
}
