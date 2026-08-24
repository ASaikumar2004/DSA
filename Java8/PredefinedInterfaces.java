package Java8;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedInterfaces {

	public static void main(String[] args) {
		//predicate -----> used for condtion checking

		Predicate<Integer> p=x->x%2==0;
		System.out.println(p.test(2));
		System.out.println(p.test(23));
		
		
		String[] name= {"sai", "sivani","rama","Seetha"};
		Predicate<String> p1=s->s.length()>2;
		for(String st:name) {
			if(p1.test(st)) {
				System.out.print(st+" ");
			}
		}
		System.out.println();
		
		//function: input, return type,: perfrom some action produce some result
		Function<Integer,Integer> f1=i->i*i;
		System.out.println(f1.apply(2));
		System.out.println(f1.apply(4));
		
		//String , String
		Function<String, String> f2=str->str.toUpperCase();
		System.out.println(f2.apply("sai"));
		System.out.println(f2.apply("sivani"));
		
		//Consumer: input--void :accept
		Consumer<String> co=c->System.out.println(c);
		co.accept("sai");
		co.accept("sivani");
		
		//supplier: no input--output-->get
		Supplier<Date> s1=()->new Date();
		System.out.println(s1.get());
		
		//otp
		Supplier<String> s2=()->{
			String otp="";
			for(int i=1;i<7;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s2.get());
	}

}
