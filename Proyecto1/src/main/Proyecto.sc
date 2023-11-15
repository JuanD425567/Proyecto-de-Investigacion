
//Funcion de aproximacion
def integral(a: Double, b: Double, f: Double => Double): Double  =
    val h = (b - a)//Calculo de b-a para la funcion de resultado
    val x_media = (a + b) / 2//Calculo de (a+b) /2 para la funcion de resultado
    val resultado = (h) * (f(a) + 4 * f(x_media) + f(b))/6//Funcion de resultado
    resultado

//Calculo de error
def calculo_error(a: Double, b: Double): Double =
    val margen = math.abs(b-a)
    margen
                        //Lanzamiento de codigo

//Primero
def f(x: Double): Double = -x*x+8*x-12//Funcion propia
val resultadoIntegral1 = integral(3, 5, f)//Llamado de la integral
val error1 = calculo_error(7.33, resultadoIntegral1)//Calculo de error

//Segundo
def f2(x:Double): Double = 3*x*x//Funcion propia
val resultadoIntegral2 = integral(0,2,f2)//Llamado de la integral
val error2 = calculo_error(8,resultadoIntegral2)//Calculo de error

//Tercero
def f3(x:Double): Double = x+2*math.pow(x,2)-3+5*math.pow(x,4)//Funcion propia
val resultadoIntegral3 =integral(-1,1,f3)//Llamado de la integral
val error3 = calculo_error( 3.333,resultadoIntegral3)//Calculo de error

//Cuarto
def f4(x:Double): Double = (2*x+1)/(math.pow(x,2)+x)//Funcion propia
val resultadoIntegral4 =integral(1,2,f4)//Llamado de la integral
val error4 = calculo_error(1.09861 , resultadoIntegral4)//Calculo de error

//Quitno
def f5(x: Double): Double= math.pow(2.718281828, x)//Funcion propia
val resultadoIntegral5 =integral(0,1,f5)//Llamado de la integral
val error5 =calculo_error(1.71828,resultadoIntegral5)//Calculo de error

//Sexto
def f6(x:Double): Double = 1/math.pow(x-1,1/2)//Funcion propia
val resultadoIntegral6 =integral(2,3,f6)//Llamado de la integral
val error6 = calculo_error(0.828427,resultadoIntegral6)//Calculo de error

//Septimo
def f7(x: Double): Double = 1/(1+math.pow(x,2))//Funcion propia
val resultadoIntegral7 =integral(0,1,f7)//Llamado de la integral
val erorr7 = calculo_error(0.785398,resultadoIntegral7)//Calculo de error







