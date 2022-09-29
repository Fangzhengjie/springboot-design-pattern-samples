 备忘录模式

 在不破坏封闭的前提下，捕获一个对象的内部状态，
 并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态

 这个不难理解，其实就是把我们之前写下来的东西记录起来，然后放在一个专门存储的地方存起来

 优点：
 （1）对象的状态可以被存储和管理起来，对象的状态可以任意回退，不用担心由于误操作而造成对象状态的丢失
 （2）对象状态的存储，对于用户或使用来者说，是屏蔽的，用户无需关心怎么实现，只需要启用备忘模式即可
 缺点：
 大量的对象的状态存储，需要耗费大量的资源，比如内存资源的消耗