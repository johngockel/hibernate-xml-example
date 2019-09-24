package de.johngockel.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.HashSet;
import java.util.Set;

public class StoreData {

    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setFirstname("Max");
        e1.setLastname("Mustermann");

        StreetAddress address = new StreetAddress();
        address.setStreet("Musterstraße");
        address.setHouseNumber("1");
        address.setTown("Musterstadt");
        address.setPostcode("12345");
        address.setCountry("Deutschland");

        Set<Address> addresses = new HashSet<Address>();
        addresses.add(address);

        e1.setAddresses(addresses);

        session.save(e1);
        t.commit();

        System.out.println("successfully saved");
        factory.close();
        session.close();
    }
}
