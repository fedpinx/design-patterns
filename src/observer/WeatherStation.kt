package observer

import observer.display.CurrentConditionsDisplay
import observer.display.StatisticsDisplay
import observer.display.ThirdPartyDisplay

fun main() {
    val weatherData = WeatherData()

    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val thirdPartyDisplay = ThirdPartyDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30.4f)
}