package jp.sou4j.sastruts.service;

/**
 * <p>サービスクラスの実装方法を規定する基底クラスです。</p>
 * @author OSCA
 * @since 1.0.0
 */
public abstract class Service {

	/**
	 * <p>ビジネスロジックを実行します。</p>
	 * @param serviceRequest ビジネスロジックを実行するにあたり必要な情報を保持する ServiceRequest クラスのインスタンス
	 * @return ビジネスロジックの実行結果情報を保持する ServiceResponse クラスのインスタンス
	 * @throws Exception 何らかの例外が発生した場合
	 */
	public abstract ServiceResponse execute(ServiceRequest serviceRequest) throws Exception;
}
