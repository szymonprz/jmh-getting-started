package pl.szymonprz;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FinderBenchmark {

    private static final Finder finder = new Finder();
    private static final List<Integer> numbers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

    @Benchmark
    public Integer benchmarkFinder(){
        return finder.minimumFrom(numbers);
    }
}
