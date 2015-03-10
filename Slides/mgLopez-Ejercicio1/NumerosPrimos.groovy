//practica numeros primos **
def rango = 2..100
def listaPrimos =  []
def resultado
 
rango.each { 
    (2..it).each { d ->
        if (it % d == 0 && it != d)
            listaPrimos.add(it)
    }
  
}
resultado = rango-listaPrimos
println "Los numeros primos son:"+resultado