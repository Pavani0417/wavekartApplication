package Listners;

import org.apache.commons.io.FileUtils;
import org.slf4j.helpers.Util;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.*;
import java.nio.charset.Charset;



import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import org.testng.IClass;
import org.testng.IConfigurationListener2;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.ConstructorOrMethod;


import org.apache.logging.log4j.LogManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
//package com.example.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class CustomListners implements ITestListener {





        private static final Logger logger = LogManager.getLogger(CustomListners.class);
        private PrintWriter writer;

        @Override
        public void onStart(ITestContext context) {
            try {
                writer = new PrintWriter(new BufferedWriter(new FileWriter("report.html")));
                writer.println("<html><head><title>Wavekart Report</title></head><body>");
                writer.println("<h1>Test Report</h1>");
                writer.println("<h2>Test Results</h2>");
                writer.println("<table border='2'>");
                writer.println("<tr><th>Test Method</th><th>Status</th><th>Duration (ms)</th><th>Log</th></tr>");
            } catch (IOException e) {
                logger.error("Error initializing report writer", e);
            }
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            writeTestResult(result, "Passed");
        }

        @Override
        public void onTestFailure(ITestResult result) {
            writeTestResult(result, "Failed");
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            writeTestResult(result, "Skipped");
        }

        @Override
        public void onFinish(ITestContext context) {
            writer.println("</table></body></html>");
            writer.close();
        }

        private void writeTestResult(ITestResult result, String status) {
            String log = getLog(result);
            writer.println("<tr>");
            writer.println("<td>" + result.getMethod().getMethodName() + "</td>");
            writer.println("<td>" + status + "</td>");
            writer.println("<td>" + (result.getEndMillis() - result.getStartMillis()) + "</td>");
            writer.println("<td>" + log + "</td>");
            writer.println("</tr>");
        }

        private String getLog(ITestResult result) {
            // Retrieve the log for the test result
            StringBuilder logBuilder = new StringBuilder();
            logBuilder.append("Detailed log for ").append(result.getMethod().getMethodName()).append("<br/>");
            // You can enhance this to pull actual log data from a log file or buffer
            return logBuilder.toString();
        }
    }



