package ir.mctab.project.config.repositories;

import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static ir.mctab.project.config.HibernateUtil.getSession;
import static ir.mctab.project.config.HibernateUtil.closeSession;
public abstract class CrudRepository<Entity, ID extends Serializable> {

    protected abstract Class<Entity> getEntityClass();

    public Entity save(Entity entity){
        getSession().getTransaction().begin();
        getSession().save(entity);
        getSession().getTransaction().commit();
        closeSession();
        return entity;
    }
    public Entity update(Entity entity){
        getSession().beginTransaction();
        getSession().update(entity);
        getSession().getTransaction().commit();
        return entity;
    }
    public void remove(Entity entity){
        getSession().beginTransaction();
        getSession().remove(entity);
        getSession().getTransaction().commit();
    }
    public Entity findbyId(ID id){
        getSession().beginTransaction();
        Entity entity=getSession().get(getEntityClass(),id);
        getSession().getTransaction().commit();
        return entity;
    }
    public List<Entity> findAll(){
        getSession().beginTransaction();
        Query<Entity> query=getSession()
                .createQuery("from "+ getEntityClass().getName()+" ", getEntityClass());
        List<Entity> entityList=query.list();
        getSession().getTransaction().commit();
        return entityList;
    }
    public List<Entity> findAll(Predicate<Entity> entityPredicate){
        getSession().beginTransaction();
        Query<Entity> query=getSession()
                .createQuery("from "+ getEntityClass().getName()+" ", getEntityClass());
        List<Entity> entityList=query.stream().filter(entityPredicate).collect(Collectors.toList());
        getSession().getTransaction().commit();
        return entityList;
    }

    public List<Entity> SearchFor(String searchFor,String searchForThis){
        getSession().beginTransaction();

        Query<Entity> query =
                getSession()
                        .createQuery("from "
                                +getEntityClass().getName()
                                +" where "+searchFor+" =: searchForThis",getEntityClass());

        query.setParameter("searchForThis",searchForThis);
        getSession().getTransaction().commit();
        return query.list();
    }
    public List<Entity> SearchFor(String searchFor,Long searchForThis){
        getSession().beginTransaction();

        Query<Entity> query =
                getSession()
                        .createQuery("from "
                                +getEntityClass().getName()
                                +" where "+searchFor+" =: searchForThis",getEntityClass());

        query.setParameter("searchForThis",searchForThis);
        getSession().getTransaction().commit();
        return query.list();
    }

    public List<Entity> SearchFor(String searchFor,String searchForThis, String searchFor2, String searchForThis2){
        getSession().beginTransaction();
        Query<Entity> query =
                getSession().createQuery(" from "
                        +getEntityClass().getName()
                        +" where "+searchFor+" =: username and "+searchFor2+"=: password ",getEntityClass());

        query.setParameter("username",searchForThis);
        query.setParameter("password",searchForThis2);
        getSession().getTransaction().commit();
        return query.list();
    }
}
