DESARROLLADOR JAVA INTERMEDIO  - Argentina Programa 4.0 
EJERCICIO 04 (Patrones de Diseño)

Consigna: 
Patrones de Diseño
Dado el siguiente contexto, diseñe e implemente una solución en el paradigma Orientado a
Objetos en Java que lo resuelva. Además, realice los tests de los casos de prueba propuestos.
Tendencias Musicales
En esta oportunidad la reconocida empresa de Youtube nos ha encargado la reingeniería del
componente de Tendencias Musicales, fundamental para sus dos plataformas: Youtube y Youtube
Music.
En particular, nos han pedido que una canción pueda mostrar una leyenda e ícono distinto, cada vez
que sea reproducida, dependiendo de su popularidad. Sin importar cual sea la popularidad de la
canción, siempre se debe mostrar un detalle que respete el siguiente formato: icono – leyenda; donde
cada ícono y leyenda será distinto para cada nivel de popularidad. Las popularidades pueden ser:
· Normal:
o Debe mostrar el ícono llamado “MUSICAL NOTE” (🎵)
o La leyenda que se debe mostrar debe respetar el siguiente formato: “Nombre del
artista – Nombre del álbum – Título de la canción”
o Cuando una canción supera las 1000 reproducciones en esa popularidad, pasa a
considerarse que está “En auge”.
· En auge:
o Debe mostrar el ícono llamado “ROCKET” (🚀)
o La leyenda que se debe mostrar debe respetar el siguiente formato: “Nombre del
artista – Título de la canción (Nombre del Álbum – Año del Álbum)”
o Si la canción supera las 50 mil reproducciones en esa popularidad y tiene más de 20 mil
likes será considerada que es Tendencia.
o Si la canción tiene 5 mil dislikes, mientras esté en esta popularidad, volverá a estar en
popularidad “Normal”.
· En tendencia:
o Debe mostrar el ícono llamado “FIRE” (🔥)
o La leyenda que se debe mostrar debe respetar el siguiente formato: “Título de la
canción – Nombre del artista (Nombre del Álbum – Año del álbum)”
o Si la canción no fue reproducida durante las últimas 24 horas, entonces volverá a ser
una canción “Normal”.
Consideraciones:
Para encontrar los sustitutos (surrogates) y/o códigos hexadecimales de los íconos, se debe utilizar la
siguiente web: https://apps.timwhitlock.info/emoji/tables/unicode
