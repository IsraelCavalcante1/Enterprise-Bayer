package com.bayer.data.controller;

import com.bayer.business.model.DiseaseRecord;
import com.bayer.business.model.Person;
import com.bayer.data.dao.DiseaseRecordDao;
import com.bayer.data.dao.PersonDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet
public class PersonServlet extends HttpServlet {

    private PersonDao personDao;
    private DiseaseRecordDao diseaseRecordDao;

    @Override
    public void init() throws ServletException {
        super.init();
        personDao = new PersonDao();
        diseaseRecordDao = new DiseaseRecordDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> personList = personDao.selectAll();
        updateUserBase(personList);

        request.setAttribute("personList", personList);
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }

    private void updateUserBase(List<Person> personList) {
        for (Person p : personList) {
            List<DiseaseRecord> records = diseaseRecordDao.findRecordsByPersonId(p.getIdPerson());
            p.setDiseaseRecords(records);
//            p.setCompanion(personDao.findCompanionById(p.getIdPerson()));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}