<h1 align="center">Calcular la Edad en un JDateChooser 🖥</h1>
<p align="center">
  
</p>
<p align="center">
  <a href="https://twitter.com/SystemJAADE">
    <img alt="Twitter: System JAADE" src="https://img.shields.io/twitter/follow/SystemJAADE.svg?style=social" target="_blank" />
  </a>
</p>

## ✨ Calcular Edad

Generado `README.md`:

```java
// Este Metodo es el que permite obtener la edad en años, meses y días
public static String edad(Date fecha_nacimiento) {
  LocalDate fecha_nacimientoLD = DateUtils.asLocalDate(fecha_nacimiento);
  LocalDate hoy = LocalDate.now();
  Period periodo = Period.between(fecha_nacimientoLD, hoy);
  String an = (periodo.getYears() == 1) ? "año" : "años";
  String me = (periodo.getMonths() == 1) ? "mes" : "meses";
  String di = (periodo.getDays() == 1) ? "día" : "días";
  return periodo.getYears() + " " + an + ", y " + periodo.getMonths() + " " + me + ", y " + periodo.getDays() + " " + di;
}
```

## 🚀

Asegurese que tiene la libreria jCalendar-1.4.jar importado dentro de su proyecto [jCalendar-1.4.jar](https://github.com/toedter/jcalendar) en este proyecto se uso la version 1.4 de esta libreria

## Colaboradores de codigo

Gracias a todas las personas que contribuyen en el Grupo [[System JAADE](https://systemjaade.com)].

## 🤝 Contribuyendo
[SystemJAADE](https://github.com/SystemJAADE)

## Author

👤 **System JAADE SAC**

- Github: [@SystemJAADE](https://github.com/SystemJAADE)
- Twitter: [@SystemJAADE](https://twitter.com/SystemJAADE)
- Youtube: [@SystemJAADE](https://www.youtube.com/c/SystemJAADE)
- Facebook: [@SystemJAADE](https://www.facebook.com/SystemJAADE/)
- Instagram: [@SystemJAADE](https://www.instagram.com/systemjaade)

## Puedes apoyarnos tu apoyo

Si este proyecto te ayudó, ⭐️ Por favor!

<a href="https://www.patreon.com/SysJ">
  <img src="https://c5.patreon.com/external/logo/become_a_patron_button@2x.png" width="160">
</a>

## 📝 Licencia

Derechos de Autor © 2020 [System JAADE](https://github.com/SystemJAADE).<br />
Este proyecto es matiene una licencia [Apache License 2.0](https://github.com/SystemJAADE/Edad/blob/master/LICENSE).

---
