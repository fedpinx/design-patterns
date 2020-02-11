package observer.base

interface IObserver {

    fun update(temperature: Float, humidity: Float, pressure: Float)
}