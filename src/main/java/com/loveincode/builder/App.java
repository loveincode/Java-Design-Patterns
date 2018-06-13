package com.loveincode.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.loveincode.builder.Hero.Builder;

/**
 * 
 * The intention of the Builder pattern is to find a solution to the telescoping
 * constructor anti-pattern. The telescoping constructor anti-pattern occurs
 * when the increase of object constructor parameter combination leads to an
 * exponential list of constructors. Instead of using numerous constructors, the
 * builder pattern uses another object, a builder, that receives each
 * initialization parameter step by step and then returns the resulting
 * constructed object at once.
 * 
 * 构造器模式的意图是找到伸缩构造函数反模式的解决方案。 当构造函数参数组合的增加导致构造函数的指数列表时，伸缩构造函数反模式发生。
 * 代替使用许多构造函数，生成器模式使用另一个对象，生成器，一步一步接收每个初始化参数，然后立即返回生成的构造对象。
 * <p>
 * The Builder pattern has another benefit. It can be used for objects that
 * contain flat data (html code, SQL query, X.509 certificate...), that is to
 * say, data that can't be easily edited. This type of data cannot be edited
 * step by step and must be edited at once. The best way to construct such an
 * object is to use a builder class.
 * 
 * 构造器模式还有另一个好处。它可以用于包含平面数据的对象（HTML代码、SQL查询、X.509证书……），
 * 也就是说，不容易编辑的数据。这种类型的数据不能一步一步地编辑，必须立即编辑。 构造这样一个对象的最佳方法是使用Builder类。
 * 
 * <p>
 * In this example we have the Builder pattern variation as described by Joshua
 * Bloch in Effective Java 2nd Edition. 在这个例子中我们有建造模式的变化是由Joshua
 * Bloch在《Effective Java 2nd Edition》中的描述。
 * <p>
 * We want to build {@link Hero} objects, but its construction is complex
 * because of the many parameters needed. To aid the user we introduce
 * {@link Builder} class. {@link Hero.Builder} takes the minimum parameters to
 * build {@link Hero} object in its constructor. After that additional
 * configuration for the {@link Hero} object can be done using the fluent
 * {@link Builder} interface. When configuration is ready the build method is
 * called to receive the final {@link Hero} object.
 * 
 * 我们想要构建{Hero}对象，但是它的构造是复杂的，因为需要很多参数。 为了帮助用户，我们引入{Builder}类。{Hero.Builder
 * }在其构造函数中采用最小参数来构建{Hero}对象。 之后，可以使用FLUENT {Builder }接口对{Hero}对象进行额外的配置。
 * 配置完成后，调用生成方法来接收最终{Hero}对象。
 * 
 */
public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Program entry point
	 * 
	 * @param args
	 *            command line args
	 */
	public static void main(String[] args) {

		Hero mage = new Hero.Builder(Profession.MAGE, "Riobard").withHairColor(HairColor.BLACK)
				.withWeapon(Weapon.DAGGER).build();
		LOGGER.info(mage.toString());

		Hero warrior = new Hero.Builder(Profession.WARRIOR, "Amberjill").withHairColor(HairColor.BLOND)
				.withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD).build();
		LOGGER.info(warrior.toString());

		Hero thief = new Hero.Builder(Profession.THIEF, "Desmond").withHairType(HairType.BALD).withWeapon(Weapon.BOW)
				.build();
		LOGGER.info(thief.toString());

	}
}