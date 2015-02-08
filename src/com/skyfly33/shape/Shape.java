package com.skyfly33.shape;

public abstract class Shape {

	double base = 0;
	double high = 0;
	double radius = 0;

	String info;

	public Shape() {
	}

	public Shape(double base, double high) {
		this.base = base;
		this.radius = high;
	}

	public Shape(double radius) {
		this.radius = radius;
	}

	public String getShapeInfo(String shape) {
		if (base != 0 && high != 0 && radius == 0)
			info = "�غ� : " + base + ", ���� : " + high + "�� " + shape + "���� �Դϴ�.";
		else if (base == 0 && high == 0 && radius != 0)
			info = "������ : " + radius + "�� " + shape + "�� �Դϴ�.";
		return info;

	}
	
	public abstract double getExtent();

}