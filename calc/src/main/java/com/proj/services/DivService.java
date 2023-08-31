package com.proj.services;

public class DivService {
	public int div(int i,int j)
	{
		if(j==0)
		{
			return Integer.MAX_VALUE;
		}
		return i/j;
	}
}
