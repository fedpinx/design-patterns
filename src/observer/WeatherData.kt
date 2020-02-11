package observer

import observer.base.IObserver
import observer.base.ISubject

class WeatherData : ISubject {
    private val observers: ArrayList<IObserver> = arrayListOf()
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    private fun measurementsChanged() = notifyObserver()

    fun getTemperature() = temperature
    fun getHumidity() = humidity
    fun getPressure() = pressure

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        measurementsChanged()
    }

    override fun registerObserver(observer: IObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: IObserver) {
        observers.indexOf(observer).let { index ->
            if (index > 0) observers.removeAt(index)
        }
    }

    override fun notifyObserver() {
        observers.forEach { observer -> observer.update(temperature, humidity, pressure) }
    }
}