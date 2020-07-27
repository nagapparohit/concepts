package dependencyInversionPrinciple.good;

public class PostgreSQLJdbcUrl implements JdbcUrl {
	 
	private final String dbName;

	public PostgreSQLJdbcUrl(String dbName) {
	        this.dbName = dbName;
	    }

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "jdbc:postgresql:// ... " + this.dbName;
	}

	
	
}
