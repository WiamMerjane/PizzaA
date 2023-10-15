package ma.ensa.pizza.service;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import ma.ensa.pizza.classes.Produit;
import ma.ensa.pizza.dao.IDao;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        Log.d("Create : ", o.toString());
        return produits.add(o);
    }

    @Override
    public Produit findById(int id) {
        Log.d("FindById : ", id+"");
        for(Produit p : produits)
            if(p.getId() == id)
                return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        Log.d("findAll : ", produits.size()+"");
        return produits;
    }

    @Override
    public boolean delete(Produit o) {
        Log.d("Delete : ", o.toString());
        return produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit p = findById(o.getId());
        p.setNom(o.getNom());
        p.setNbrIngredients(o.getNbrIngredients());
        p.setDescription(o.getDescription());
        p.setDuree(o.getDuree());
        p.setDetaisIngred(o.getDetaisIngred());
        p.setPhoto(o.getPhoto());
        p.setPreparation(o.getPreparation());
        return false;
    }
}
