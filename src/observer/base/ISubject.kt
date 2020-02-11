package observer.base

interface ISubject {

    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObserver()
}