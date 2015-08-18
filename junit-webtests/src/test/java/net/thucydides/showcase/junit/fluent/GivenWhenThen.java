package net.thucydides.showcase.junit.fluent;

import org.hamcrest.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by john on 6/08/2015.
 */
public class GivenWhenThen {
    public static <T> T givenThat(T actor) {
        return actor;
    }

    public static Actor andThat(Actor actor) {return actor; }

    public static Actor when(Actor actor) { return actor; }

    public static <T> void then(T actual, Matcher<? super T> matcher) {
        assertThat(actual, matcher);
    }
}
