package cn.edu.zjut.po;

import java.sql.Blob;

public class Item
{
    private ItemPK ipk;
    private String description;
    private float cost;
    private Blob image;

    public Item()
    {
    }

    public Item(ItemPK ipk)
    {
        this.ipk = ipk;
    }

    public Item(ItemPK ipk, String description, float cost, Blob image)
    {
        this.ipk = ipk;
        this.description = description;
        this.cost = cost;
        this.image = image;
    }

    public ItemPK getIpk()
    {
        return ipk;
    }

    public void setIpk(ItemPK ipk)
    {
        this.ipk = ipk;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public float getCost()
    {
        return cost;
    }

    public void setCost(float cost)
    {
        this.cost = cost;
    }

    public Blob getImage()
    {
        return image;
    }

    public void setImage(Blob image)
    {
        this.image = image;
    }
}