package consultation.repository;

import java.util.List;

//CRUD
//C - CREATE
//R - READ
//U - UPDATE
//D - DELETE
public interface Repository<T> {

    //READ
    List<T> findAll();

    //CREATE
    void save(T item);

    //DELETE
    void delete(T item);

}
