package com.makman.pokedex;

import java.io.Serializable;

/**
 * Created by ntille on 2/3/16.
 */
public class Pokemon implements Serializable {


    // id,identifier,species_id,height,weight

    private String mName, mId, mSpeciesId, mHeight, mWeight;

    private String BaseExp, mHp, mSpeed, mSpecDef, mSpecAtk, mDefence, mAttack;


    public Pokemon(String csvStr) {
        String[] split = csvStr.trim().split(",");

        mId = split[0];
        mName = split[1];
        mSpeciesId = split[2];
        mHeight = split[3];
        mWeight = split[4];
    }

    public String getImageUrl(){
        return "http://img.pokemondb.net/artwork/" + getName() + ".jpg";
    }

    public String getStatsUrl(){
        return "http://pokeapi.co/api/v2/pokemon/" + mId;
    }
    public String getId() {
        return mId;
    }

    public String getSpeciesId() {
        return mSpeciesId;
    }

    public String getHeight() {
        return mHeight;
    }

    public String getWeight() {
        return mWeight;
    }

    public String getName() {
        return mName;
    }

    public String getBaseExp() {
        return BaseExp;
    }

    public void setBaseExp(String baseExp) {
        BaseExp = baseExp;
    }

    public String getmHp() {
        return mHp;
    }

    public void setmHp(String mHp) {
        this.mHp = mHp;
    }

    public String getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(String mSpeed) {
        this.mSpeed = mSpeed;
    }

    public String getmSpecDef() {
        return mSpecDef;
    }

    public void setmSpecDef(String mSpecDef) {
        this.mSpecDef = mSpecDef;
    }

    public String getmSpecAtk() {
        return mSpecAtk;
    }

    public void setmSpecAtk(String mSpecAtk) {
        this.mSpecAtk = mSpecAtk;
    }

    public String getmDefence() {
        return mDefence;
    }

    public void setmDefence(String mDefence) {
        this.mDefence = mDefence;
    }

    public String getmAttack() {
        return mAttack;
    }

    public void setmAttack(String mAttack) {
        this.mAttack = mAttack;
    }

    public boolean updated() {
        return !(getmSpecAtk() == null ||
                getmSpecDef() == null ||
                getmHp() == null ||
                getmDefence() == null ||
                getmAttack() == null ||
                getmSpeed() == null ||
                getBaseExp() ==null);
    }
}
