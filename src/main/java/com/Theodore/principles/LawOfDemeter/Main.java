package com.Theodore.principles.LawOfDemeter;

/**
 * 如果两个软件实体无须直接通信，那么就不应该发生直接的相互调用，可以通过第三方转发该调用，其目的是降低类之间的耦合度，提高模块独立性
 * 迪米特法则中的"朋友"是指，当前对象本身，当前对象的成员对象，当前对象所创建的对象，当前对象的方法参数等，
 * 这些对象同当前对象存在关联，聚合或组合关系可以直接访问这些对象的方法
 */
public class Main {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star = new Star("刘德华");
        agent.setStar(star);
        Fans fans = new Fans("张三");
        agent.setFans(fans);
        Company company = new Company("无敌媒体公司");
        agent.setCompany(company);
        agent.meeting();
        agent.business();
    }
}
