/**
 * Author:zhangmingqiang.
 * Date  :2016/8/30.
 * Description:
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String say(String name) {
        return "hello " + name;
    }
}
