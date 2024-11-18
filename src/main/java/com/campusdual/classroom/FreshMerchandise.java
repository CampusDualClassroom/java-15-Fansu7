package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

  protected Date expirationDate;
  protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

  public FreshMerchandise(String name, String uniqueId, String responsibleId) {
    super(name, uniqueId, responsibleId);
  }

  public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
    super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
    this.expirationDate = expirationDate;
  }

  public Date getExpirationDate(){
    return this.expirationDate;
  }

  public String getFormattedDate(Date date){
    return sdf.format(date);
  }

  @Override
  public Object getSpecificData() {
    StringBuilder builder = new StringBuilder();
    builder.append("Localizacion: ");
    builder.append(getLocation());
    builder.append("\n");
    builder.append("Caducidad: ");
    builder.append(sdf.format(this.getExpirationDate()));
    return builder.toString();
  }

  public void printSpecificData(){
    System.out.println(this.getSpecificData());
  }
}
