package jp.sou4j.sastruts.service;

import java.io.Serializable;

/**
 * <p>サービスクラスでビジネスロジックを実行する際に渡した ServiceRequest クラスのインスタンスで保持した値を検証した結果を表すクラスです。</p>
 * @author OSCA
 * @since 1.0.0
 */
public abstract class ServiceRequestValidatedResult implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>検証の結果、1つでも誤りがあるか否かを返却します。</p>
	 * @return 誤りの有無 (true:誤りがある, false:誤りがない)
	 */
	public abstract boolean hasError();
}
