package com.fuwei.constant;

public enum OrderStatus {
	/*已创建*/
	CREATE {public String getName(){return "已创建";} public String getStepName(){return "确定订单";}},
//	/*待确认样确认*/
//	CONFIRMSAMPLE {public String getName(){return "打确认样";}},
//	/*待产前样确认*/
//	BEFOREPRODUCESAMPLE{public String getName(){return "打产前样";}},
//	/*在染色*/
//	COLORING{public String getName(){return "在染色";}},
//	/*在备纱*/
//	YARNING{public String getName(){return "在备纱";}},
//	/*在机织*/
//	MACHINING{public String getName(){return "在机织";}},
	/*待发货*/
	DELIVERING{public String getName(){return "待发货";} public String getStepName(){return "执行发货";}},
	/*已发货*/
	DELIVERED{public String getName(){return "已发货";} public String getStepName(){return "执行收货";}},
    /* 交易已完成 */
    COMPLETED {public String getName(){return "交易已完成";} public String getStepName(){return null;}},
	 /* 已取消 */
    CANCEL {public String getName(){return "已取消";} public String getStepName(){return null;}};
   
    public abstract String getName();
    public abstract String getStepName();
}
