package uchikoba.sampleBeanUtilis;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtilsBean;

public class UseBeanUtilis {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

		SampleBean sample1 = new SampleBean();
		List<SampleDetailBean> bean1 = new ArrayList<SampleDetailBean>();
		SampleDetailBean db1 = new SampleDetailBean();

		db1.setS2("sampledeatai1");
		bean1.add(db1);
		sample1.setList(bean1);

		SampleBean2 sample2 = new SampleBean2();
		List<SampleDetailBean2> bean2 = new ArrayList<SampleDetailBean2>();
		SampleDetailBean2 db2 = new SampleDetailBean2();
		db2.setS1("sampledeatai1にない");
		db2.setS2("sampledeatai1にある");
		bean2.add(db2);
		SampleDetailBean2 db3 = new SampleDetailBean2();
		db3.setS1("sampledeatai1にない");
		db3.setS2("sampledeatai1にある");
		bean2.add(db3);

		sample2.setList(bean2);

		BeanUtilsBean.getInstance().copyProperties(sample1, sample2);

		System.out.println("sample1にSampleDetailBean2がｾｯﾄされちゃったよ");

	}

}
