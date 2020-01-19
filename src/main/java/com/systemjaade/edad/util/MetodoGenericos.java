package com.systemjaade.edad.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 * @author Tarazona Marrujo El� Gamaliel - "System JAADE S.A.C."
 * @version 18/01/2020 02:16 AM UTC -5
 */
public class MetodoGenericos {

  public static String edad(Date fecha_nacimiento) {
    LocalDate fecha_nacimientoLD = DateUtils.asLocalDate(fecha_nacimiento);
    LocalDate hoy = LocalDate.now();
    Period periodo = Period.between(fecha_nacimientoLD, hoy);
    String an = (periodo.getYears() == 1) ? "a�o" : "a�os";
    String me = (periodo.getMonths() == 1) ? "mes" : "meses";
    String di = (periodo.getDays() == 1) ? "d�a" : "d�as";
    return periodo.getYears() + " " + an + ", y " + periodo.getMonths() + " " + me + ", y " + periodo.getDays() + " " + di;
  }
}
