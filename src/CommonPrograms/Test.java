package CommonPrograms;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.Streams;
import org.omg.Messaging.SyncScopeHelper;

public class Test {

	public static void main(String args[]) throws IOException {
		
		String str = "abcabb";
		
		str.chars().distinct().forEach(a -> System.out.println((char)a));

//			
//		String str = "aabc dddfg abc";
//		int greatestWord = 0;
//		String s = "";
//		String[] strArr = str.split(" ");
//		for (int m = 0; m < strArr.length; m++) {
//
//			int[] freq = new int[strArr[m].length()];
//			char[] charArr = strArr[m].toCharArray();
//			int max;
//
//			char maxChar = charArr[0];
//
//			for (int i = 0; i < charArr.length; i++) {
//				freq[i] = 1;
//				for (int j = i + 1; j < charArr.length; j++) {
//					if (charArr[i] == charArr[j]) {
//						freq[i]++;
//						charArr[j] = '0';
//					}
//				}
//			}
//
//			max = freq[0];
//			for (int i = 0; i < charArr.length; i++) {
//
//				if (max < freq[i] && charArr[i] != '0') {
//					max = freq[i];
//					maxChar = charArr[i];
//				}
//			}
//
//			System.out.println(max + " - " + maxChar + " - " + strArr[m]);
//			
//			
//			for (int i = 0; i < strArr.length; i++) {
//				if(greatestWord<max) {
//					s = strArr[i];
//					greatestWord = max;
//				}
//			}
//			
//
//		}
//		System.out.println(greatestWord + " - "+s);
	}

}
