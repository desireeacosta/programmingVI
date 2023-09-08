package classes;

import classes.builder.ImportingSubsidiary;
import classes.builder.Subsidiary;

class Main {
  public static void main(String[] args) {
    Subsidiary frenchSubsidiary = Subsidiary.builder().country("France").build();
    ImportingSubsidiary americanSubsidiary = ImportingSubsidiary.builder().country("United States").shipmentDepartment("France Department").build();
  }
}
