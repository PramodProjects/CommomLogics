package CommonPrograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Java8_ConvertPrimitiveStreamToObjectStream {

	public static void main(String[] args) {
		Stream<Integer> stream = IntStream.of(1, 2, 3, 4, 5).boxed();

		Stream<Long> stream1 = LongStream.of(1, 2, 3, 4, 5).boxed();

		Stream<Double> stream2 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0).boxed();
		
		

	}

}
