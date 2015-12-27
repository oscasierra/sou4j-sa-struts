package jp.sou4j.sastruts.service;

import jp.sou4j.util.validator.Validator;

/**
 * <p>サービスクラスでビジネスロジックを実行する際に渡された ServiceRequest クラスのインスタンスが保持する値を検証するためのクラスです。</p>
 * @author OSCA
 * @since 1.0.0
 */
public abstract class ServiceRequestValidator extends Validator {

	/**
	 * <p>ServiceRequest クラスのインスタンスが保持する値を検証します。</p>
	 * @param serviceRequest ServiceRequest クラスのインスタンス
	 * @return 検証結果
	 */
	public abstract ServiceRequestValidatedResult validate(ServiceRequest serviceRequest);
}
