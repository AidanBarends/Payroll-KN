package za.ac.mycput.payrollkn.Service;


public interface IService <T,ID> {

    T create(T t);

    T read(ID Id);

    T update(T t);

    boolean delete(ID Id);

}
