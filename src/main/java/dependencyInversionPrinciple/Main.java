package dependencyInversionPrinciple;
/**
 * The main motto of the dependency inversion is:
 * Any higher classes should always depend upon the abstraction of the class rather than the detail.
 * @author rohit
 *
 */
public class Main {
	public static void main(String[] args) {

        System.out.println("\nApproach that doesn't follow DIP:\n");

        dependencyInversionPrinciple.bad.PostgreSQLJdbcUrl p1
                = new dependencyInversionPrinciple.bad.PostgreSQLJdbcUrl("my_db");
        dependencyInversionPrinciple.bad.ConnectToDatabase c1
                = new dependencyInversionPrinciple.bad.ConnectToDatabase();

        c1.connect(p1);

        System.out.println("\nApproach that follow ISP:\n");

        dependencyInversionPrinciple.good.PostgreSQLJdbcUrl p2
                = new dependencyInversionPrinciple.good.PostgreSQLJdbcUrl("my_db");
        dependencyInversionPrinciple.good.MySQLJdbcUrl p3
                = new dependencyInversionPrinciple.good.MySQLJdbcUrl("my_db");
        
        dependencyInversionPrinciple.good.ConnectToDatabase c2
                = new dependencyInversionPrinciple.good.ConnectToDatabase();

        c2.connect(p2);
        c2.connect(p3);
    }
}
