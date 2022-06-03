import com.bayer.business.model.Address;
import com.bayer.business.model.DiseaseRecord;
import com.bayer.business.model.Gender;
import com.bayer.business.model.Person;
import com.bayer.data.dao.AddressDAO;
import com.bayer.data.dao.DiseaseRecordDao;
import com.bayer.data.dao.PersonDao;

import java.util.GregorianCalendar;
import java.util.List;

import static com.bayer.data.dao.ObjectFactoryForDAO.address1;
import static com.bayer.data.dao.ObjectFactoryForDAO.address2;

public class PersonTeste {
    public static void main(String[] args) {
        Address address = address1();
        PersonDao personDao = new PersonDao();

//        AddressDAO addressDao = new AddressDAO();
//
//        addressDao.create(address);

//        Person person = new Person(34117815832L, "Mariazinha", Gender.FEMALE,
//                new GregorianCalendar(1995 ,6,15).getTime(),
//                false, address1(), 9833898);
//
//
//        Person personTeste = personDao.findByCpf(34117815832L);
//        Person personTeste2 = personDao.findByCpf(54117815822L);
//
//        personTeste.setCompanion(personTeste2);
//        personTeste2.setCompanion(personTeste);
//
//        personDao.updateCompanion(personTeste2);
//        personDao.updateCompanion(personTeste);
        DiseaseRecordDao diseaseRecordDao = new DiseaseRecordDao();

        for (Person p : personDao.selectAll()) {
            List<DiseaseRecord> records = diseaseRecordDao.findRecordsByPersonId(p.getIdPerson());
            p.setDiseaseRecords(records);
            System.out.println(p);
        }

        for (DiseaseRecord record : diseaseRecordDao.selectAll()) {
            System.out.println(record.toString());
        }

    }
}
