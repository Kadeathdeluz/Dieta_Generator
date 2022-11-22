package proyectos.kade.dietagenerator.data

import proyectos.kade.dietagenerator.R
import proyectos.kade.dietagenerator.model.Meal
import proyectos.kade.dietagenerator.model.Day
import proyectos.kade.dietagenerator.model.Diet
import kotlin.random.Random

class DataSource {

    fun loadDiet(randomFlag: Boolean): List<Day> {
        return if(randomFlag) randomDiet()
            else normalDiet()
    }
    private fun normalDiet(): List<Day> {
        return listOf(
            alea[0].monday,
            alea[0].tuesday,
            alea[0].wednesday,
            alea[0].thursday,
            alea[0].friday,
            alea[0].saturday,
            alea[0].sunday
        )
    }
    private fun randomDiet(): List<Day> {
        val size = alea.size
        return listOf(
            alea[Random.nextInt(0, size)].monday,
            alea[Random.nextInt(0, size)].tuesday,
            alea[Random.nextInt(0, size)].wednesday,
            alea[Random.nextInt(0, size)].thursday,
            alea[Random.nextInt(0, size)].friday,
            alea[Random.nextInt(0, size)].saturday,
            alea[Random.nextInt(0, size)].sunday
        )
    }
    private companion object {
        val alea: List<Diet> = listOf(
            Diet(
                monday = Day(
                    meal = Meal(
                        firstID = R.string.lunes_uno_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.lunes_uno_cena,
                    dayID = R.string.monday
                ),
                tuesday = Day(
                    meal = Meal(
                        firstID = R.string.martes_uno_pr,
                        secondID = R.string.martes_uno_seg
                    ),
                    dinnerID = R.string.martes_uno_cena,
                    dayID = R.string.tuesday
                ),
                wednesday = Day(
                    Meal(
                        firstID = R.string.miercoles_uno_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.miercoles_uno_cena,
                    dayID = R.string.wednesday
                ),
                thursday = Day(
                    Meal(
                        firstID = R.string.jueves_uno_pr,
                        secondID = R.string.jueves_uno_seg
                    ),
                    dinnerID = R.string.jueves_uno_cena,
                    dayID = R.string.thursday
                ),
                friday = Day(
                    Meal(
                        firstID = R.string.viernes_uno_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.viernes_uno_cena,
                    dayID = R.string.friday
                ),
                saturday = Day(
                    Meal(
                        firstID = R.string.sabado_uno_pr,
                        secondID = R.string.sabado_uno_seg
                    ),
                    dinnerID = R.string.sabado_uno_cena,
                    dayID = R.string.saturday
                ),
                sunday = Day(
                    Meal(
                        firstID = R.string.domingo_uno_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.domingo_uno_cena,
                    dayID = R.string.sunday
                )
            ),
            Diet(
                monday = Day(
                    meal = Meal(
                        firstID = R.string.lunes_dos_pr,
                        secondID = R.string.lunes_dos_seg
                    ),
                    dinnerID = R.string.lunes_dos_cena,
                    dayID = R.string.monday
                ),
                tuesday = Day(
                    meal = Meal(
                        firstID = R.string.martes_dos_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.martes_dos_cena,
                    dayID = R.string.tuesday
                ),
                wednesday = Day(
                    Meal(
                        firstID = R.string.miercoles_dos_pr,
                        secondID = R.string.miercoles_dos_seg
                    ),
                    dinnerID = R.string.miercoles_dos_cena,
                    dayID = R.string.wednesday
                ),
                thursday = Day(
                    Meal(
                        firstID = R.string.jueves_dos_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.jueves_dos_cena,
                    dayID = R.string.thursday
                ),
                friday = Day(
                    Meal(
                        firstID = R.string.viernes_dos_pr,
                        secondID = R.string.viernes_dos_seg
                    ),
                    dinnerID = R.string.viernes_dos_cena,
                    dayID = R.string.friday
                ),
                saturday = Day(
                    Meal(
                        firstID = R.string.sabado_dos_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.sabado_dos_cena,
                    dayID = R.string.saturday
                ),
                sunday = Day(
                    Meal(
                        firstID = R.string.domingo_dos_pr,
                        secondID = R.string.domingo_dos_seg
                    ),
                    dinnerID = R.string.domingo_dos_cena,
                    dayID = R.string.sunday
                )

            ),
            Diet(
                monday = Day(
                    meal = Meal(
                        firstID = R.string.lunes_tres_pr,
                        secondID = R.string.lunes_tres_seg
                    ),
                    dinnerID = R.string.lunes_tres_cena,
                    dayID = R.string.monday
                ),
                tuesday = Day(
                    meal = Meal(
                        firstID = R.string.martes_tres_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.martes_tres_cena,
                    dayID = R.string.tuesday
                ),
                wednesday = Day(
                    Meal(
                        firstID = R.string.miercoles_tres_pr,
                        secondID = R.string.miercoles_tres_seg
                    ),
                    dinnerID = R.string.miercoles_tres_cena,
                    dayID = R.string.wednesday
                ),
                thursday = Day(
                    Meal(
                        firstID = R.string.jueves_tres_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.jueves_tres_cena,
                    dayID = R.string.thursday
                ),
                friday = Day(
                    Meal(
                        firstID = R.string.viernes_tres_pr,
                        secondID = R.string.viernes_tres_seg
                    ),
                    dinnerID = R.string.viernes_tres_cena,
                    dayID = R.string.friday
                ),
                saturday = Day(
                    Meal(
                        firstID = R.string.sabado_tres_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.sabado_tres_cena,
                    dayID = R.string.saturday
                ),
                sunday = Day(
                    Meal(
                        firstID = R.string.domingo_tres_pr,
                        secondID = R.string.domingo_tres_seg
                    ),
                    dinnerID = R.string.domingo_tres_cena,
                    dayID = R.string.sunday
                )
            ),
            Diet(
                monday = Day(
                    meal = Meal(
                        firstID = R.string.lunes_cuatro_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.lunes_cuatro_cena,
                    dayID = R.string.monday
                ),
                tuesday = Day(
                    meal = Meal(
                        firstID = R.string.martes_cuatro_pr,
                        secondID = R.string.martes_cuatro_seg
                    ),
                    dinnerID = R.string.martes_cuatro_cena,
                    dayID = R.string.tuesday
                ),
                wednesday = Day(
                    Meal(
                        firstID = R.string.miercoles_cuatro_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.miercoles_cuatro_cena,
                    dayID = R.string.wednesday
                ),
                thursday = Day(
                    Meal(
                        firstID = R.string.jueves_cuatro_pr,
                        secondID = R.string.jueves_cuatro_seg
                    ),
                    dinnerID = R.string.jueves_cuatro_cena,
                    dayID = R.string.thursday
                ),
                friday = Day(
                    Meal(
                        firstID = R.string.viernes_cuatro_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.viernes_cuatro_cena,
                    dayID = R.string.friday
                ),
                saturday = Day(
                    Meal(
                        firstID = R.string.sabado_cuatro_pr,
                        secondID = R.string.sabado_cuatro_seg
                    ),
                    dinnerID = R.string.sabado_cuatro_cena,
                    dayID = R.string.saturday
                ),
                sunday = Day(
                    Meal(
                        firstID = R.string.domingo_cuatro_pr,
                        secondID = R.string.empty
                    ),
                    dinnerID = R.string.domingo_cuatro_cena,
                    dayID = R.string.sunday
                )
            )

        )
    }


}

