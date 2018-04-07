# Thread-demo

## Java多线程实现方式主要有四种：

1、继承Thread类;

2、实现Runnable接口;

3、实现Callable接口通过FutureTask包装器来创建Thread线程;

4、使用ExecutorService、Callable、Future实现有返回结果的多线程。

其中前两种方式线程执行完后都没有返回值，后两种是带返回值的。
