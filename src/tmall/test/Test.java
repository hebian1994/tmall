

package tmall.test;
import java.io.IOException;
import tmall.dao.CategoryDAO;


public class Test {

	public static void main(String[] args) throws IOException {
		System.out.println(new CategoryDAO().list());

	}
}

