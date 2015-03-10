//practica 3. Sustitucion  o por X

        def cadena = "Hola Mundo lupita loca cocono"
        def auxiliar="";
        def indice=0;
        def resultado="";
        def contador=1;

        while(indice<cadena.length()&&cadena.indexOf("o")>-1)
        {
            indice=cadena.indexOf("o",indice)


            for (int x=0; x<contador; x++ ) {
               auxiliar=auxiliar+"x"
            }
            indice++
            resultado = cadena.substring(0, indice-1) + auxiliar+cadena.substring(indice,cadena.length())
            cadena=resultado
            contador++
            auxiliar=""
        }
        println resultado