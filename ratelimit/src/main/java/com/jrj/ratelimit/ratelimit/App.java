package com.jrj.ratelimit.ratelimit;

import com.google.common.util.concurrent.RateLimiter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	double permitsPerSecond=3;
		RateLimiter limit=RateLimiter.create(permitsPerSecond);
		while(true){
			Double time=limit.acquire();
			 System.out.println( "wait time:"+time );
		}
       
    }
}
