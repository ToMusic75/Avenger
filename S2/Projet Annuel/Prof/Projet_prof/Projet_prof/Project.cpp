#include "Project.h"

#pragma once

#include <cstdlib>
#if _WIN32
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT
#endif

extern "C" {
	DLLEXPORT double* linear_create_model(int nb_features) {
		auto w = new double(nb_features + 1);
		for (auto i = 0; i < nb_features + 1; i++) {
			w[i] = ((double)rand()) / RAND_MAX * 2.0 - 1.0;
		}
		return w;
	}

	DLLEXPORT double linear_predict_model_regression(double* model, double* inputs, int inputs_size)){
	auto sum = model[0];
	for (auto i = 0; i < inputs_size; i++) {
		sum += model[i + 1] * inputs[i];
	}
	return sum;
	}

	DLLEXPORT double linear_predict_model_classification(double* model, double* inputs, int inputs_size) {
		auto sum = linear_predict_model_regression(model, inputs, inputs_size);
		return sum >= 0 ? 1.0 : -1.0;
	}

	DLLEXPORT void linear_dispose_model(double* model) {
		delete[] model;
	}

	DLLEXPORT void linear_dispose_model_calssification(
		double* model,
		double* dataset_inputs,
		double* dataset_expected_outputs,
		int dataset_samples_count,
		int dataset_sample_features_count,
		double alpha,
		int iteration_count)
	{
		for (auto it = 0; it < iteration_count; it++) {
			auto k = (int)(((double) fmin(rand(), _Y:RAND_MAX - 1)) * dataset_samples_count);
			auto inputs_k = dataset_inputs + k * dataset_sample_features_count;
			auto output_k = dataset_expected_outputs[k];

			auto semi_grad = expected_output_k - expected_output_
			for (auto i = 0; i < dataset_sample_features_count i++) {
				model[i + 1] += alpha * (expected_output_k )
			}
		}
	}
}
