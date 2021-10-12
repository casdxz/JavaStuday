package top.bearcad.java.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-29 22:32
 **/
@Slf4j
public class SingletonEnumDemo {
    /**
     * 内部私有枚举
     */
    private enum SingletonEnum{
        /**
         * 枚举势力（单例）
         */
        INSTANCE;
        /**
         * 枚举属性
         */
        private  String name;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
    public static  void  main (String name){
        SingletonEnum.INSTANCE.setName("soft");
        log.info(SingletonEnum.INSTANCE.getName());
    }

}
