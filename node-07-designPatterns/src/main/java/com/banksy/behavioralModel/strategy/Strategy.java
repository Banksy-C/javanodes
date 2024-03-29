package com.banksy.behavioralModel.strategy;

/**
 * 策略模式
 * Define a family of algorithms,encapsulate each one,and make them interchangeable.
 * 定义一组算法， 将每个算法都封装起来， 并且使它们之间可以互换；
 *
 * 角色：封装角色、抽象策略角色、具体策略角色
 * 优点： 算法可以自由切换；避免使用多重条件判断；扩展性良好；
 * 缺点：策略类数量增多；所有的策略类都需要对外暴露；
 * 适用场景：多个类只有在算法或行为上稍有不同的场景；算法需要自由切换的场景；需要屏蔽算法规则的场景；
 *
 * @author banksy
 * @version 1.0
 **/
public class Strategy {
}

class Context {}

