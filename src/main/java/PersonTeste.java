import com.bayer.business.model.Address;
import com.bayer.business.model.Gender;
import com.bayer.business.model.Person;
import com.bayer.data.dao.AddressDAO;
import com.bayer.data.dao.PersonDao;

import java.util.GregorianCalendar;

import static com.bayer.data.dao.ObjectFactoryForDAO.address1;
import static com.bayer.data.dao.ObjectFactoryForDAO.address2;

public class PersonTeste {
    public static void main(String[] args) {
        Address address = address2();
        PersonDao personDao = new PersonDao();

        AddressDAO addressDao = new AddressDAO();
//
        addressDao.create(address);

            Person person = new Person(93217815832L, "Marialdo", Gender.MALE,
                new GregorianCalendar(1994 ,6,12).getTime(),
                false, address2(), 9833898);



    personDao.create(person);
    }
}
