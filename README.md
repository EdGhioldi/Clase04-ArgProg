DESARROLLADOR JAVA INTERMEDIO  - Argentina Programa 4.0 <br>
EJERCICIO 04 (Patrones de Diseño)<br><br>
<br>
Consigna: <br>
Patrones de Diseño<br><br>
Dado el siguiente contexto, diseñe e implemente una solución en el paradigma Orientado a<br>
Objetos en Java que lo resuelva. Además, realice los tests de los casos de prueba propuestos.<br>
Tendencias Musicales<br>
En esta oportunidad la reconocida empresa de Youtube nos ha encargado la reingeniería del<br>
componente de Tendencias Musicales, fundamental para sus dos plataformas: Youtube y Youtube<br>
Music.<br>
En particular, nos han pedido que una canción pueda mostrar una leyenda e ícono distinto, cada vez<br>
que sea reproducida, dependiendo de su popularidad. Sin importar cual sea la popularidad de la<br>
canción, siempre se debe mostrar un detalle que respete el siguiente formato: icono – leyenda; donde<br>
cada ícono y leyenda será distinto para cada nivel de popularidad. Las popularidades pueden ser:<br><br>
· Normal:<br>
o Debe mostrar el ícono llamado “MUSICAL NOTE” (🎵)<br>
o La leyenda que se debe mostrar debe respetar el siguiente formato: “Nombre del<br>
artista – Nombre del álbum – Título de la canción”<br>
o Cuando una canción supera las 1000 reproducciones en esa popularidad, pasa a<br>
considerarse que está “En auge”.<br><br>
· En auge:<br>
o Debe mostrar el ícono llamado “ROCKET” (🚀)<br>
o La leyenda que se debe mostrar debe respetar el siguiente formato: “Nombre del<br>
artista – Título de la canción (Nombre del Álbum – Año del Álbum)”<br>
o Si la canción supera las 50 mil reproducciones en esa popularidad y tiene más de 20 mil<br>
likes será considerada que es Tendencia.<br>
o Si la canción tiene 5 mil dislikes, mientras esté en esta popularidad, volverá a estar en<br>
popularidad “Normal”.<br><br>
· En tendencia:<br>
o Debe mostrar el ícono llamado “FIRE” (🔥)<br>
o La leyenda que se debe mostrar debe respetar el siguiente formato: “Título de la<br>
canción – Nombre del artista (Nombre del Álbum – Año del álbum)”<br>
o Si la canción no fue reproducida durante las últimas 24 horas, entonces volverá a ser<br>
una canción “Normal”.<br><br>
Consideraciones:<br>
Para encontrar los sustitutos (surrogates) y/o códigos hexadecimales de los íconos, se debe utilizar la<br>
siguiente web: https://apps.timwhitlock.info/emoji/tables/unicode
