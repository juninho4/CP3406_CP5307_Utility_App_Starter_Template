package au.edu.jcu.cp3406_cp5307_utilityappstartertemplate

class CurrencyRepository {
    suspend fun convertCurrency(
        amount: Double,
        rate: Double
    ): Double {
        return amount * rate
    }
}